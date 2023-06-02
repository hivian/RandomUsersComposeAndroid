package com.hivian.compose_mvvm.domain.usecases

import com.hivian.compose_mvvm.domain.models.RandomUser
import com.hivian.compose_mvvm.domain.repository.IRandomUsersRepository
import com.hivian.compose_mvvm.domain.repository.ServiceResult
import javax.inject.Inject

class GetRandomUsersUseCase @Inject constructor(
    private val randomUsersService: IRandomUsersRepository
) {

    suspend operator fun invoke(pageIndex: Int, pageSize: Int): ServiceResult<List<RandomUser>> {
        return randomUsersService.fetchRandomUsers(pageIndex, pageSize)
    }

}