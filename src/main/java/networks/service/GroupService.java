package networks.service;

import networks.model.Group;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface GroupService {

    List<Group> getAll();

    List<Group> getByNameOfGroup(String name);

    void create(Group group) throws IOException;

    void getAllFromFile(File file) throws IOException;

}
