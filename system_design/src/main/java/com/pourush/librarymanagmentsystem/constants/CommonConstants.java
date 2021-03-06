package com.pourush.librarymanagmentsystem.constants;

import lombok.Data;

/**
 * Created by pourush.sinha on 19/03/19.
 */
@Data
public class CommonConstants {

    public static final int MAX_BOOKS_ISSUED_TO_A_USER = 5;
    public static final int MAX_LENDING_DAYS = 10;

    public enum BookFormat {
        HARDCOVER,
        PAPERBACK,
        AUDIO_BOOK,
        EBOOK,
        NEWSPAPER,
        MAGAZINE,
        JOURNAL
    }

    public enum BookStatus {
        AVAILABLE,
        RESERVED,
        LOANED,
        LOST
    }

    public enum ReservationStatus{
        WAITING,
        PENDING,
        CANCELED,
        NONE,
        COMPLETED
    }

    public enum AccountStatus{
        ACTIVE,
        CLOSED,
        CANCELED,
        BLACKLISTED,
        NONE
    }
}
