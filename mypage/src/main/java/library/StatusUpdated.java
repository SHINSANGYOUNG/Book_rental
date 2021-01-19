package library;

public class StatusUpdated extends AbstractEvent {

    private Long id;
    private Long bookId;
    private String bookStatus;
    private Long memberID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getBookName() {
        return bookId;
    }

    public void setBookName(Long bookId) {
        this.bookId = bookId;
    }
    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }
    public Long getMemberId() {
        return memberID;
    }

    public void setMemberId(Long memberID) {
        this.memberID = memberID;
    }

}