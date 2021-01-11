internal class RegisterAnswererImpl(
    private val userRepository: UserRepository
) : RegisterAnswerer {
    override fun invoke(user: User) {
        userRepository.registerUser(user)
    }
}
