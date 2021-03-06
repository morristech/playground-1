package com.davidtiagoconceicao.androidmovies.mvp;

/**
 * Base interface for views.
 * <p>
 * Created by david on 22/02/17.
 */

public interface BaseView<T> {

    void setPresenter(T presenter);
}
