package com.messagetree.interf;

/**
 * 用于异步返回结果的接口.
 */

public interface AsyncResult<ResultType> {
    void returnResult(ResultType result);
}
