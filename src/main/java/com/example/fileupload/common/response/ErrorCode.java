package com.example.fileupload.common.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    // FILE
    FILE_INVALID_EXTENSION("유효한 파일 형식이 아닙니다.");

    private final String errorMsg;

}
