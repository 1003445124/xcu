package cn.edu.xcu.demo.service.impl;

import cn.edu.xcu.demo.entity.Book;
import cn.edu.xcu.demo.mapper.BookMapper;
import cn.edu.xcu.demo.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 3072 kB; (`tid`) REFER `xcxy/t_type`(`id`) ON DELETE NO ACTION ON U 服务实现类
 * </p>
 *
 * @author nydegang
 * @since 2019-11-02
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
