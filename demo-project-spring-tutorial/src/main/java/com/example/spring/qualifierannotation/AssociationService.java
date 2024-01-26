package com.example.spring.qualifierannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AssociationService {
    @Autowired
    @Qualifier("barAssociation")
    public association association;

    public void whichAssociation()
    {
        association.createAssociation();
    }
}
