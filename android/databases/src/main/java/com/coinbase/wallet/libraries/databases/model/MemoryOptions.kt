package com.coinbase.wallet.libraries.databases.model

import android.content.Context

/**
 * Options for Room memory db
 *
 * @property context Android context used to create room db
 * @property providerClazz Room-specific database provider
 */
data class MemoryOptions<T>(val context: Context, val providerClazz: Class<T>)
