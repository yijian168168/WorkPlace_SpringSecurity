package com.security;

/**
 * Created by Lenovo-PC-QR on 2016/11/23.
 */
public abstract interface UrlMatcher
{
    public abstract Object compile(String paramString);
    public abstract boolean pathMatchesUrl(Object paramObject, String paramString);
    public abstract String getUniversalMatchPattern();
    public abstract boolean requiresLowerCaseUrl();
}