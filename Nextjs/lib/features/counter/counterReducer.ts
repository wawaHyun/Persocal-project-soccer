import { createAction, handleActions } from 'redux-actions'

const INCREASE = 'conter/INCREASE' // + 버튼과 같은 역할
const DECREASE = 'conter/DECREASE' // - 버튼과 같은 역할

export const increase : any = createAction(INCREASE)
export const decrease : any= createAction(DECREASE)

const initialState = { count: 5 } //useState와 같은 역할

const counterReducer = handleActions(
    {
        [INCREASE]: (state, action) => ({ count: state.count + 1 }), //계산하는 기능 들어가는 부분
        [DECREASE]: (state, action) => ({ count: state.count - 1 }),
    },
    initialState
)

export default counterReducer;