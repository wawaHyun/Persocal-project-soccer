import { createSlice } from "@reduxjs/toolkit"


interface IUser {

}

const initialState:IUser = {

}

export const userSlice = createSlice({
    name : "user",
    initialState,
    reducers : {

    }
})

export const {}  = userSlice.actions

export default userSlice.reducer;
