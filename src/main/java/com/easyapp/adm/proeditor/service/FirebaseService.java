package com.easyapp.adm.proeditor.service;

import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class FirebaseService {

    public List<String> listDocuments(String collectionName) {
        Firestore firestore = FirestoreClient.getFirestore();
        var c = firestore.collection(collectionName).listDocuments().iterator();
        List<String> newList = new ArrayList<>();
        while (c.hasNext()) {
            newList.add(c.next().getPath());
        }
        return newList;
    }
}
