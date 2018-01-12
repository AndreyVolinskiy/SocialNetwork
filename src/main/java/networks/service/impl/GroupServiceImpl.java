package networks.service.impl;

import networks.dao.GroupDao;
import networks.dao.factory.DaoFactory;
import networks.dao.impl.GroupDaoImpl;
import networks.model.AbstractEntity;
import networks.model.Group;
import networks.service.GroupService;

import java.io.*;
import java.util.List;

public class GroupServiceImpl implements GroupService {
    @Override
    public List<Group> getAll() {
        GroupDao groupDao = DaoFactory.getGroupDao();
        return groupDao.getAll();
    }

    @Override
    public List<Group> getByNameOfGroup(String name) {
        GroupDao groupDao = DaoFactory.getGroupDao();
        return groupDao.getByNameOfGroup(name);
    }

    @Override
    public void create(Group group) throws IOException {
        String filePath = "src\\main\\resources\\groups.txt";
        File file = new File(filePath);
//        file.delete();
//        file.createNewFile();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

        writer.write("1. Name of group: " + group.getNameOfGroup() + "\n");
        writer.write("2. Admin: " + group.getAdmin() + "\n");
        writer.write("3. Description: " + group.getDescription() + "\n");
        writer.write("3. Number of followers: " + group.getNumberOfFollowers() + "\n");
        writer.write("\n");

        writer.flush();
        writer.close();

    }

    @Override
    public void getAllFromFile(File file) throws IOException {
        String text;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while ((text = reader.readLine())!=null) {
            System.out.println(text);
        }
        reader.close();
    }

    @Override
    public void update(AbstractEntity entity) {

    }

    @Override
    public void create(AbstractEntity entity) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List findAll() {
        return null;
    }
}

