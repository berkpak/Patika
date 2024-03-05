package dev.patika.library.api;

import dev.patika.library.business.abstracts.IAuthorService;
import dev.patika.library.business.abstracts.IBookService;
import dev.patika.library.business.abstracts.ICategoryService;
import dev.patika.library.business.abstracts.IPublisherService;
import dev.patika.library.core.config.modelMapper.IModelMapperService;
import dev.patika.library.core.result.Result;
import dev.patika.library.core.result.ResultData;
import dev.patika.library.core.utilies.ResultHelper;
import dev.patika.library.dto.request.book.BookSaveRequest;
import dev.patika.library.dto.request.book.BookUpdateRequest;
import dev.patika.library.dto.response.CursorResponse;
import dev.patika.library.dto.response.book.BookResponse;
import dev.patika.library.entities.Author;
import dev.patika.library.entities.Book;
import dev.patika.library.entities.Publisher;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/books")
public class BookController {

    private final IBookService bookService;
    private final IModelMapperService modelMapper;
    private final IAuthorService authorService;
    private final IPublisherService publisherService;
    private final ICategoryService categoryService;

    public BookController(IBookService bookService, IModelMapperService modelMapper, IAuthorService authorService, IPublisherService publisherService, ICategoryService categoryService) {
        this.bookService = bookService;
        this.modelMapper = modelMapper;
        this.authorService = authorService;
        this.publisherService = publisherService;
        this.categoryService = categoryService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public BookResponse save(@Valid @RequestBody BookSaveRequest bookSaveRequest){
        Book saveBook = this.modelMapper.forRequest().map(bookSaveRequest, Book.class);

        Author author = this.authorService.get(bookSaveRequest.getAuthorId());
        saveBook.setAuthor(author);

        Publisher publisher = this.publisherService.get(bookSaveRequest.getPublisherId());
        saveBook.setPublisher(publisher);

        this.bookService.save(saveBook);
        return this.modelMapper.forResponse().map(saveBook, BookResponse.class);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<BookResponse> get(@PathVariable("id") int id){
        Book book = this.bookService.get(id);
        BookResponse bookResponse = this.modelMapper.forResponse().map(book, BookResponse.class);
        return ResultHelper.success(bookResponse);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CursorResponse<BookResponse>> cursor(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {

        Page<Book> bookPage = this.bookService.cursor(page, pageSize);
        Page<BookResponse> bookResponsePage = bookPage.map(book -> this.modelMapper.forResponse().map(book, BookResponse.class));
        return ResultHelper.cursor(bookResponsePage);
    }
    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<BookResponse> update(@Valid @RequestBody BookUpdateRequest bookUpdateRequest){
        this.bookService.get(bookUpdateRequest.getId());
        Book updateBook = this.modelMapper.forRequest().map(bookUpdateRequest, Book.class);
        this.bookService.update(updateBook);
        return ResultHelper.success(this.modelMapper.forResponse().map(updateBook, BookResponse.class));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Result delete(@PathVariable("id") int id){
        this.bookService.delete(id);
        return ResultHelper.ok();
    }
}
