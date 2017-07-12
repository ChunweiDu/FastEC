package com.dcw.latte.net;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * @Author： duchunwei
 * @Date: 2017/7/12   10:14
 * @Email： duchunwei_it@163.com
 */

public interface RestService {
    /**
     * GET请求方式
     *
     * @param url    请求路径
     * @param params 请求参数
     * @return 请求结果
     */
    @GET
    Call<String> get(@Url String url, @QueryMap Map<String, Object> params);

    /**
     * POST请求
     *
     * @param url    请求路径
     * @param params 请求参数
     * @return 请求结果
     */
    @FormUrlEncoded
    @POST
    Call<String> post(@Url String url, @FieldMap Map<String, Object> params);

    /**
     * PUT
     *
     * @param url    put路径
     * @param params put参数
     * @return 返回结果
     */
    @FormUrlEncoded
    @PUT
    Call<String> put(@Url String url, @FieldMap Map<String, Object> params);

    /**
     * 删除
     *
     * @param url    删除路径
     * @param params 删除参数
     * @return 返回结果
     */
    @DELETE
    Call<String> delete(@Url String url, @QueryMap Map<String, Object> params);

    /**
     * 下载
     *
     * @param url    下载路径
     * @param params 下载参数
     * @return 返回结果
     */
    @Streaming
    @GET
    Call<ResponseBody> download(@Url String url, @QueryMap Map<String, Object> params);

    /**
     * 上传
     *
     * @param url  上传路径
     * @param file 上传文件
     * @return 返回结果
     */
    @Multipart
    @POST
    Call<String> upload(@Url String url, @Part MultipartBody.Part file);
}
