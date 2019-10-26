package com.haruspring.springbatchexample1.batch;

import com.haruspring.springbatchexample1.model.User;
import com.haruspring.springbatchexample1.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * FIXME 本来はここでItemWriterの処理を実装しようと思ったが、write()内のエラーが分からんので一旦未使用にしている
 */
// @Component
public class DBWriter implements ItemWriter<User> {

    private static final Logger LOGGER = LoggerFactory.getLogger(DBWriter.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {

        // LOGGER.info("Data Saved for Users: " + users);

        // このコンパイルエラーが分からない…
        // userRepository.save(users);
    }
}
