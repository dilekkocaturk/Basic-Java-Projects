public interface IEntityRepository<T extends IEntity> {
    public void add(T entity);

    public void delete(T entity);

    public void update(T entity);
}
