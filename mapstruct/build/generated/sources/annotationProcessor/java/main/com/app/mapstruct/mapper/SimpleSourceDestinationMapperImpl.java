package com.app.mapstruct.mapper;

import com.app.mapstruct.pojo.SimpleDestination;
import com.app.mapstruct.pojo.SimpleSource;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-23T20:37:46+0530",
    comments = "version: 1.6.0.Beta1, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.12.1.jar, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class SimpleSourceDestinationMapperImpl implements SimpleSourceDestinationMapper {

    @Override
    public SimpleDestination sourceTODestination(SimpleSource source) {
        if ( source == null ) {
            return null;
        }

        SimpleDestination simpleDestination = new SimpleDestination();

        simpleDestination.setName( source.getName() );
        simpleDestination.setDescription( source.getDescription() );

        return simpleDestination;
    }

    @Override
    public SimpleSource destinationTOSource(SimpleDestination destination) {
        if ( destination == null ) {
            return null;
        }

        SimpleSource simpleSource = new SimpleSource();

        simpleSource.setName( destination.getName() );
        simpleSource.setDescription( destination.getDescription() );

        return simpleSource;
    }
}
