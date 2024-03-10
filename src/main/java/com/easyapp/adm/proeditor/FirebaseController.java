package com.easyapp.adm.proeditor;

import com.easyapp.adm.proeditor.service.FirebaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("teste")
public class FirebaseController {

    @Autowired
    private FirebaseService firebaseService;

    @GetMapping()
    public List<String> listDocuments(@PathVariable String collectionName) {
        return firebaseService.listDocuments(collectionName);
    }
}
