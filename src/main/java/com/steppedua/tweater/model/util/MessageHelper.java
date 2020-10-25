package com.steppedua.tweater.model.util;

import com.steppedua.tweater.model.User;

public abstract class MessageHelper {

    public static String getAuthorName(User author) {
        return author != null ? author.getUsername() : "<none>";
    }
}
