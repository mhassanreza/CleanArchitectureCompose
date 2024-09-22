package com.plcoding.cryptocurrencyappyt.presentation.coin_detail

import com.bigint.cryptosample.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
