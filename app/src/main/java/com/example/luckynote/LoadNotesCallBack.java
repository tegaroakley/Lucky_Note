package com.example.luckynote;

import com.example.luckynote.entity.Note;

import java.util.ArrayList;

public interface LoadNotesCallBack {
    void preExecute();

    void postExecute(ArrayList<Note> notes);
}
