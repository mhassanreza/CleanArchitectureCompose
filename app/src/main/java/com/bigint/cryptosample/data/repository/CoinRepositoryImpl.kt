package com.bigint.cryptosample.data.repository

import com.bigint.cryptosample.domain.repository.CoinRepository
import com.bigint.cryptosample.data.remote.CoinPaprikaApi
import com.bigint.cryptosample.data.remote.dto.CoinDetailDto
import com.bigint.cryptosample.data.remote.dto.CoinDto
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}