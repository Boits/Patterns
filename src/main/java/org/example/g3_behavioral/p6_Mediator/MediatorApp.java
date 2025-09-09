package org.example.g3_behavioral.p6_Mediator;

public class MediatorApp {

    /**
     * Представим себе чат-комнату, в которой пользователи отправляют сообщения.
     * Каждый пользователь может отправить сообщение,
     * которое посредник (чат-комната) распределит другим пользователям.
     */

    public static void call() {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Alice");
        User user2 = new ChatUser(chatRoom, "Bob");
        User user3 = new ChatUser(chatRoom, "Charlie");
        User user4 = new ChatUser(chatRoom, "Diana");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        user1.send("Hello, everyone!");
    }
}
