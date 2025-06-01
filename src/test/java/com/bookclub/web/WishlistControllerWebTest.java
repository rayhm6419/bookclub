package com.bookclub.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

@WebMvcTest(WishlistController.class)
public class WishlistControllerWebTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAddWishlistItem() throws Exception {
        mockMvc.perform(post("/wishlist/add")
                .param("title", "Test Book")
                .param("author", "Jane Doe"))
            .andExpect(status().is3xxRedirection())
            .andExpect(redirectedUrl("/wishlist"));
    }
}
