import axios from 'axios';
import { createAsyncThunk } from '@reduxjs/toolkit';
import { createSlice } from "@reduxjs/toolkit";
import { initialState } from './counter.init';


export const counterSlice = createSlice({
  name: "counter",
  initialState,
  reducers: {
    handlePlus: (state) => {
      state.value += 1;
    },
    handleMinus: (state) => {
      state.value -= 1;
    },
    incrementByAmount: (state, action) => {
      state.value += action.payload;
    },
  },
});

export const { handlePlus, handleMinus, incrementByAmount } = counterSlice.actions

export const getCount = (state:any) => state.count.value;

export default counterSlice.reducer;