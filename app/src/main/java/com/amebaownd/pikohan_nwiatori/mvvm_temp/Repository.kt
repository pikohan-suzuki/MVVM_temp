package com.amebaownd.pikohan_nwiatori.mvvm_temp

//リポジトリ
class Repository(){

    fun getRandom():Num{
        return RandomNum.getRandomNum()
    }
}


//APIとDBの代わり
class RandomNum(){
    companion object{
        fun getRandomNum():Num{
            val random = (Math.random()*10000f).toInt()
            return Num(random)
        }
    }
}