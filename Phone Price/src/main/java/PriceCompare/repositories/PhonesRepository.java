package PriceCompare.repositories;


import PriceCompare.models.Phones;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhonesRepository extends MongoRepository<Phones, String> {
    Phones findBy_id(ObjectId _id);
}
