package com.hivian.compose_mvvm.domain.di

import com.hivian.compose_mvvm.domain.repository.IRandomUsersRepository
import com.hivian.compose_mvvm.data.repository.RandomUsersRepositoryImpl
import com.hivian.compose_mvvm.data.services.database.IDatabaseService
import com.hivian.compose_mvvm.data.services.networking.IHttpClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Provides
    @Singleton
    fun provideRandomUsersRepository(database: IDatabaseService, httpClient: IHttpClient): IRandomUsersRepository {
        return RandomUsersRepositoryImpl(database, httpClient)
    }

}
