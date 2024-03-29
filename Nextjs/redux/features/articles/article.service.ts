import { createAsyncThunk } from "@reduxjs/toolkit";
import axios from "axios";
import { API } from "@/redux/common/enums/API";
import AxiosConfig from "@/redux/common/configs/axios-config";
import { getAllArticlesAPI } from "./article.api";

export const getAllArticles: any = createAsyncThunk('articles/getAllArticles',
    async (page: number, { rejectWithValue }) => {
        console.log('getArticles page : '+page)
        try {
            // const { allArticles }: any = await getAllArticlesAPI
            // return { allArticles }

            axios.get(`${API.SERVER}/api/all-articles`, AxiosConfig())
            .then(res => {
                const response = res.data.message
                console.log(res.data.message)
                console.log(res.data.result)
                if (response === 'SUCCESS') {
                    console.log("게시글이 있습니다.")
                    for (let i of res.data.result) {
                        console.log(i);
                        // setArticles(res.data.result);
                    }
                } else if (response === 'FAIL') {
                    console.log("게시글이 없습니다.")
                } else {
                    console.log("지정되지 않은 값")
        
                }
                return res.data
            })

        } catch (error) {
            console.log('getArticles error : ' + error)
            return rejectWithValue(error)
        }
    }

    // async (page: number, { rejectWithValue }) => {
    //         console.log('getArticles page : '+page)
    //     const{message,result}:any = getAllArticlesAPI(1);
    //     console.log('-------------API를 사용한 경우---------')
    //     console.log('message')
    //     console.log(JSON.stringify(result))
    // return data
    //     }
)