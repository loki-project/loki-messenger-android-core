package org.whispersystems.signalservice.loki.database

interface LokiUserDatabaseProtocol {

    fun getDisplayName(publicKey: String): String?
    fun getServerDisplayName(serverID: String, publicKey: String): String?
    fun getProfilePictureURL(publicKey: String): String?
}
