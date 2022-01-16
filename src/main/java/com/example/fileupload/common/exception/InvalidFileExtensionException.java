package com.example.fileupload.common.exception;

import com.example.fileupload.common.response.ErrorCode;

public class InvalidFileExtensionException extends RuntimeException{

    public InvalidFileExtensionException() {
        super(ErrorCode.FILE_INVALID_EXTENSION.getErrorMsg());
    }

    public InvalidFileExtensionException(String message) {
        super(message);
    }
}
