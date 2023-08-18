package com.example.mycomposeapicall.domain.repository

import com.example.mycomposeapicall.data.remote.dto.CoinDetailDto
import com.example.mycomposeapicall.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins():List<CoinDto>
    suspend fun getCoinById(coinId:String): CoinDetailDto
}