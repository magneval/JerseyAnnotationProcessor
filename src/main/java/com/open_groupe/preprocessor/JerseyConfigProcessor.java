package com.open_groupe.preprocessor ;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@SupportedAnnotationTypes("javax.ws.rs.Path")
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class JerseyConfigProcessor extends AbstractProcessor {

    public JerseyConfigProcessor() {
        super();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations,
        RoundEnvironment roundEnv) {
        System.out.println("annotations = "+annotations);
        return true;
    }
}

