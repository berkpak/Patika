package dev.patika.library.api;

import dev.patika.library.business.abstracts.IBookBorrowService;
import dev.patika.library.business.abstracts.IBookService;
import dev.patika.library.core.config.modelMapper.IModelMapperService;
import dev.patika.library.core.result.Result;
import dev.patika.library.core.result.ResultData;
import dev.patika.library.core.utilies.ResultHelper;
import dev.patika.library.dto.request.bookBorrow.BookBorrowSaveRequest;
import dev.patika.library.dto.request.bookBorrow.BookBorrowUpdateRequest;
import dev.patika.library.dto.response.CursorResponse;
import dev.patika.library.dto.response.bookBorrow.BookBorrowResponse;
import dev.patika.library.entities.Book;
import dev.patika.library.entities.BookBorrow;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/bookborrows")
public class BookBorrowController {

    private final IBookBorrowService bookBorrowService;
    private final IModelMapperService modelMapper;
    private final IBookService bookService;

    public BookBorrowController(IBookBorrowService bookBorrowService, IModelMapperService modelMapper, IBookService bookService) {
        this.bookBorrowService = bookBorrowService;
        this.modelMapper = modelMapper;
        this.bookService = bookService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public BookBorrowResponse save(@Valid @RequestBody BookBorrowSaveRequest bookBorrowSaveRequest){
        BookBorrow saveBookBorrow = this.modelMapper.forRequest().map(bookBorrowSaveRequest, BookBorrow.class);

        Book book = this.bookService.get(bookBorrowSaveRequest.getBookId());
        saveBookBorrow.setBook(book);

        this.bookBorrowService.save(saveBookBorrow);
        return this.modelMapper.forResponse().map(saveBookBorrow, BookBorrowResponse.class);
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<BookBorrowResponse> get(@PathVariable("id") int id){
        BookBorrow bookBorrow = this.bookBorrowService.get(id);
        BookBorrowResponse bookBorrowResponse = this.modelMapper.forResponse().map(bookBorrow, BookBorrowResponse.class);
        return ResultHelper.success(bookBorrowResponse);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CursorResponse<BookBorrowResponse>> cursor(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {

        Page<BookBorrow> bookBorrowPage = this.bookBorrowService.cursor(page, pageSize);
        Page<BookBorrowResponse> borrowResponsePage = bookBorrowPage.map(bookBorrow -> this.modelMapper.forResponse().map(bookBorrow, BookBorrowResponse.class));
        return ResultHelper.cursor(borrowResponsePage);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<BookBorrowResponse> update(@Valid @RequestBody BookBorrowUpdateRequest bookBorrowUpdateRequest){
        this.bookBorrowService.get(bookBorrowUpdateRequest.getId());
        BookBorrow updateBorrow = this.modelMapper.forRequest().map(bookBorrowUpdateRequest, BookBorrow.class);
        this.bookBorrowService.update(updateBorrow);
        return ResultHelper.success(this.modelMapper.forResponse().map(updateBorrow, BookBorrowResponse.class));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Result delete(@PathVariable("id") int id){
        this.bookBorrowService.delete(id);
        return ResultHelper.ok();
    }
}
