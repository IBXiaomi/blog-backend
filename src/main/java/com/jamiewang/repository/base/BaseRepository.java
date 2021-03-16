package com.jamiewang.repository.base;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.lang.NonNull;

import java.util.Collection;
import java.util.List;

/**
 * common repository
 *
 * @author jamiewang
 * @date 16/03/2021
 */
@NoRepositoryBean
public interface BaseRepository<D, I> extends JpaRepository<D, I> {

//    @NonNull
//    List<D> findAllDomainsInIDs(@NonNull Collection<I> ids, @NonNull Sort sort);
}
