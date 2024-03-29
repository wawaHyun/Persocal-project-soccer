import { createSlice, isFulfilled } from "@reduxjs/toolkit";
import { initialState } from "../counter/counter.init";
import { getAllArticles } from "./article.service";

const articleThunks = [getAllArticles]
const status = {
    pending: 'pending',
    fulfilled: 'Fulfilled',
    rejected: 'rejects'
}

const handlePending = (state: any) => {
}
const handleFulfilled = (state: any,{payload}:any) => {
                console.log('-------------------------------------------')
                console.log(JSON.stringify(payload))
}
const handlerejects = (state: any) => {
}

export const articleSlice = createSlice({
    name: "article",
    initialState: initialState,
    reducers: {},
    extraReducers: builder => {
        const { pending, rejected } = status;

        builder
            .addCase('', handleFulfilled)

        // builder
        //     .addCase(getAllArticles.fulfilled, (state, { payload }: any) => {
        //     })
    }
})

export const { } = articleSlice.actions

export default articleSlice.reducer;

