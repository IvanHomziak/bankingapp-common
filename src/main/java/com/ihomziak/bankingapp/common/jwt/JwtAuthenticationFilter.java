package com.ihomziak.bankingapp.common.jwt;

public class JwtAuthenticationFilter
//        extends OncePerRequestFilter
{
//
//    private final JwtTokenProvider jwtTokenProvider;
//
//    public JwtAuthenticationFilter(JwtTokenProvider jwtTokenProvider) {
//        this.jwtTokenProvider = jwtTokenProvider;
//    }
//
//    @Override
//    protected void doFilterInternal(@NonNull HttpServletRequest request,
//                                    @NonNull HttpServletResponse response,
//                                    @NonNull FilterChain filterChain)
//            throws ServletException, IOException {
//
//        String token = getTokenFromRequest(request);
//
//        if (token != null && jwtTokenProvider.validateToken(token)) {
//            String username = jwtTokenProvider.getUsername(token);
//            String role = jwtTokenProvider.getRole(token);
//
//            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
//                    username, null, Collections.singletonList(new SimpleGrantedAuthority(role)));
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//        }
//
//        filterChain.doFilter(request, response);
//    }
//
//    private String getTokenFromRequest(HttpServletRequest request) {
//        String bearerToken = request.getHeader("Authorization");
//        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
//            return bearerToken.substring(7);
//        }
//        return null;
//    }
}
