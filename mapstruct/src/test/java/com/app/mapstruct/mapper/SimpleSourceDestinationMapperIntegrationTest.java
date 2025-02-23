package com.app.mapstruct.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.app.mapstruct.pojo.SimpleDestination;
import com.app.mapstruct.pojo.SimpleSource;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { SimpleSourceDestinationMapperImpl.class })
public class SimpleSourceDestinationMapperIntegrationTest {

    @Autowired
    SimpleSourceDestinationMapper simpleSourceDestinationMapper;

    @Test
    public void givenSourceToDestination_whenMaps_thenCorrect() {
        SimpleSource simpleSource = new SimpleSource();
        simpleSource.setName("SourceName");
        simpleSource.setDescription("SourceDescription");

        SimpleDestination destination = simpleSourceDestinationMapper.sourceTODestination(simpleSource);

        assertEquals(simpleSource.getName(), destination.getName());
        assertEquals(simpleSource.getDescription(), destination.getDescription());
    }

    @Test
    public void givenDestinationToSource_whenMaps_thenCorrect() {
        SimpleDestination destination = new SimpleDestination();
        destination.setName("DestinationName");
        destination.setDescription("DestinationDescription");

        SimpleSource source = simpleSourceDestinationMapper.destinationTOSource(destination);

        assertEquals(destination.getName(), source.getName());
        assertEquals(destination.getDescription(), source.getDescription());
    }

}
