package com.example.belajarbottombarjet.feature.auth.domain.usecase

import com.example.belajarbottombarjet.core.data.Resource
import com.example.belajarbottombarjet.feature.auth.data.AuthRepository
import com.example.belajarbottombarjet.feature.auth.domain.model.User
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AuthInteractor @Inject constructor(private val authRepository: AuthRepository): AuthUseCase{
    override fun loginWithEmailAndPassword(
        email: String,
        password: String
    ): Flow<Resource<User>> {
        return authRepository.loginWithEmailAndPassword(email, password)
    }
}