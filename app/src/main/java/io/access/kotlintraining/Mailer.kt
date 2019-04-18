package io.access.kotlintraining

interface Mailer {
    fun sendMessage(email: String, message: String)
}

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    // TODO: 実装する
    if (client == null || message == null) return

    client ?: return
    message ?: return

    val personalInfo = client.personalInfo ?: return

    val email = personalInfo.email ?: return

    mailer.sendMessage(email, message);

}

// コンパイル通すための諸々
class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
