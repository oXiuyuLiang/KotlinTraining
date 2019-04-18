package io.access.kotlintraining

class ss {
    fun sendMessageToClient(
            @Nullable client: Client?,
            @Nullable message: String?,
            @NonNull mailer: Mailer) {
        if (client == null || message == null) return

        val personalInfo = client.personalInfo ?: return

        val email = personalInfo.email ?: return

        mailer.sendMessage(email, message)
    }
}
