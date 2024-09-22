package com.bigint.cryptosample.domain.repository

import com.bigint.cryptosample.data.remote.dto.CoinDetailDto
import com.bigint.cryptosample.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}