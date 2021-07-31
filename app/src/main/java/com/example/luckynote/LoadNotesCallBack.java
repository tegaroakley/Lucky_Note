package com.example.luckynote;

import java.util.ArrayList;

public interface LoadNotesCallBack {
    void preExecute();

    void postExecute(ArrayList<Note> notes);
}
