import {createAction,handleAction} from 'redux-actions'

export const articleConstants = {
    ARTICLES_REQUSET : 'ARTICLES_REQUSET',
    ARTICLES_SUCCESS : 'ARTICLES_SUCCESS',
    ARTICLES_FAILURE : 'ARTICLES_FAILURE',
}

export const getArticlesSuccess = createAction(articleConstants.ARTICLES_SUCCESS);
export const getArticlesFailure = createAction(articleConstants.ARTICLES_FAILURE);
export const getArticlesRequst = createAction(articleConstants.ARTICLES_REQUSET);