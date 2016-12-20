package Contact.Registry;


import Contact.LocalContact;

import java.util.UUID;

public class UniqueIdGenerator {


            public  void  idGenrator (){
               new LocalContact().setId(UUID.randomUUID());

                }
            }
}
