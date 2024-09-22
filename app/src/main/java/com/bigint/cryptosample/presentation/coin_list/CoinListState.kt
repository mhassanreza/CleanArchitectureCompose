package com.bigint.cryptosample.presentation.coin_list

import com.bigint.cryptosample.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
