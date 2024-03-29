import { createAction,handleAction } from "redux-actions"

export const userConstants = {
    USER_REQUSET : 'USER_REQUSET',
    USER_SUCCESS : 'USER_SUCCESS',
    USER_FAILURE : 'USER_FAILURE',
}

export const getUserSuccess = createAction(userConstants.USER_SUCCESS);
export const getUserFailure = createAction(userConstants.USER_FAILURE);
export const getUserRequset = createAction(userConstants.USER_REQUSET);