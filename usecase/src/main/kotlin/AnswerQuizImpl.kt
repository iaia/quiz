internal class AnswerQuizImpl(
    private val answerRepository: AnswerRepository
) : AnswerQuiz {
    override fun invoke(answer: Answer) {
        answerRepository.saveAnswer(answer)
    }
}
