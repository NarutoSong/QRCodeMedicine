package org.out.naruto.network;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by Hao_S on 2015/5/19.
 */

public class NetWork {
    public final int Type_Login = 100;
    private final String loginUrl = "";

    public int Type_Register = 200;



    public JSONArray UserLogin(List<NameValuePair> params,int requestType) {
        JSONArray jsonArray = null;
        HttpPost httpPost = null;
        switch (requestType) {
            case Type_Login:
                httpPost = new HttpPost(loginUrl);
                break;
        }

        HttpResponse httpResponse;
        String data = "";
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
            httpResponse = new DefaultHttpClient().execute(httpPost);
            if(httpResponse.getStatusLine().getStatusCode()== HttpStatus.SC_OK) {
                InputStream inputStream = httpResponse.getEntity().getContent();
                BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream));
                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    data += line + "\r\n";
                }
            }
            data =data.trim();
            jsonArray = new JSONArray(data);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }
}
