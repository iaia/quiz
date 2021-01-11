internal class RegisterQuestionerImpl(
    private val userRepository: UserRepository
) : RegisterQuestioner {
    override fun invoke(user: User) {
        userRepository.registerUser(user)
    }
}
