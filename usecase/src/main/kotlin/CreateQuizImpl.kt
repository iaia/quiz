internal class CreateQuizImpl(
    private val quizRepository: QuizRepository
) : CreateQuiz {
    override fun invoke(quiz: Quiz) {
        quizRepository.createQuiz(quiz)
    }
}
